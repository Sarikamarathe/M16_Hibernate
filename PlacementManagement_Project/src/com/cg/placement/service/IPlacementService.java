package com.cg.placement.service;

import com.cg.placement.entities.Placement;

public interface IPlacementService {

	public Placement addPlacement(Placement placement);  // C
	public Placement updatePlacement(Placement placement); // U
	public Placement searchPlacement(int id); // R
	public Placement deletePlacement(Placement placement); // D
}
