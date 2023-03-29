package com.example.finalprojectspring.services.implementations;

import com.example.finalprojectspring.exceptions.BranchNotFoundException;
import com.example.finalprojectspring.models.Branch;
import com.example.finalprojectspring.services.BranchService;

import java.util.List;

/**
 * @author Tiina Raudla
 * @Date
 */
public class BranchServiceImpl implements BranchService {
    @Override
    public void createBranch(Branch branch) {

    }

    @Override
    public Branch findBranchById(Long id) throws BranchNotFoundException {
        return null;
    }

    @Override
    public Branch findBranchByAddress(String address) throws BranchNotFoundException {
        return null;
    }

    @Override
    public List<Branch> findAllBranches() {
        return null;
    }

    @Override
    public void updateBranch(Branch branch) throws BranchNotFoundException {

    }

    @Override
    public void deleteBranchById(Long id) throws BranchNotFoundException {

    }

    @Override
    public void restoreBranchById(Long id) throws BranchNotFoundException {

    }
}
