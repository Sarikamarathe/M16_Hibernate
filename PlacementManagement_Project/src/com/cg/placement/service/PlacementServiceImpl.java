package com.cg.placement.service;

import com.cg.placement.entities.Placement;
import com.cg.placement.repository.IPlacementRepository;
import com.cg.placement.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl implements IPlacementService {

	IPlacementRepository dao;

//	Step 1: Call the IPlacementRepository or dao 
	public PlacementServiceImpl() {
		dao = new PlacementRepositoryImpl();
	}
	
//  Step 2: Implement methods IPlacementRepo
	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
	}

	@Override
	public Placement deletePlacement(Placement placement) {
		dao.beginTransaction();
		dao.deletePlacement(placement);
		dao.commitTransaction();
			return placement;
		}


}
