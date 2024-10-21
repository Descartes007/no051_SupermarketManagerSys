package com.supermarket.service.impl;

import com.supermarket.dao.SupplierDao;
import com.supermarket.entity.Supplier;
import com.supermarket.service.SupplierService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class SupplierServiceImpl implements SupplierService {

    @Resource
    private SupplierDao supplierDao;

    public List<Supplier> findAll(Map<String, Object> result) {
        return supplierDao.findAll(result);
    }

    public Long count(Map<String, Object> result) {
        return supplierDao.count(result);
    }

    public Supplier findRepeat(String name) {
        return supplierDao.findRepeat(name);
    }

    public Integer add(Supplier supplier) {
        return supplierDao.add(supplier);
    }

    public Integer delete(Integer id) {
        return supplierDao.delete(id);
    }

    public Integer update(Supplier supplier) {
        return supplierDao.update(supplier);
    }
}
