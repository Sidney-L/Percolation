# Percolation
Princeton Algorithm Programming Assignment 1
Write a program to estimate the value of the percolationthreshold via Monte Carlo simulation.

Percolation. Given a composite systems comprised ofrandomly distributed insulating and metallic materials: whatfraction of the materials need to be metallic so that the compositesystem is an electrical conductor? Given a porous landscape withwater on the surface (or oil below), under what conditions will thewater be able to drain through to the bottom (or the oil to gushthrough to the surface)? Scientists have defined an abstractprocess known aspercolation to model such situations.

The model. We model a percolation system using anN-by-N grid ofsites. Each site iseitheropen or blocked. A full site isan open site that can be connected to an open site in the top rowvia a chain of neighboring (left, right, up, down) open sites. Wesay the systempercolates if there is a full site in thebottom row. In other words, a system percolates if we fill all opensites connected to the top row and that process fills some opensite on the bottom row. (For the insulating/metallic materialsexample, the open sites correspond to metallic materials, so that asystem that percolates has a metallic path from top to bottom, withfull sites conducting. For the porous substance example, the opensites correspond to empty space through which water might flow, sothat a system that percolates lets water fill open sites, flowingfrom top to bottom.)
![percolates-yes](https://github.com/Sidney-L/Percolation/raw/master/pic/percolates-yes.png)
