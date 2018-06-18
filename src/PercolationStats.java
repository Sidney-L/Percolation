import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
public class PercolationStats {
	private final double mean;
	private final double stddev;
	private final double confidenceLo;
	private final double confidenceHi;
	public PercolationStats(int n, int trials) {
	    if (n <= 0 || trials <= 0)
		    throw new IllegalArgumentException();
	    int rdr,rdc;
	    double[] x = new double[trials];
	    for(int i = 0; i < trials; i++) {
		Percolation uf = new Percolation(n);
		while(!uf.percolates()) {
			do {
				rdr = StdRandom.uniform(n)+1;
				rdc = StdRandom.uniform(n)+1;
			} while(uf.isOpen(rdr,rdc));
			uf.open(rdr,rdc);
		}
		x[i]=(double)uf.numberOfOpenSites()/(n*n);
	}
	    mean = StdStats.mean(x);
	    stddev = StdStats.stddev(x);
	    confidenceLo = mean()-1.96*stddev()/Math.sqrt(trials);
	    confidenceHi = mean()+1.96*stddev()/Math.sqrt(trials);
	}
	public double mean() {
	    	return mean;
		
	}
	public double stddev() {
	    	return stddev;
	}
	public double confidenceLo() {
	    	return confidenceLo;
	}
	public double confidenceHi() {
	    	return confidenceHi;
	}
	public static void main(String[] args) {
		int rdr, rdc;
		PercolationStats p = new PercolationStats(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		
		System.out.println("mean = "+p.mean());
		System.out.println("stddev = "+p.stddev());
		System.out.println("95% confidence interval = ["+p.confidenceLo()+", " +p.confidenceHi()+"]");
	}
}
