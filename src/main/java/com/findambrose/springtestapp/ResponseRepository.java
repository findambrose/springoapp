package com.findambrose.springtestapp;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends CrudRepository<MyResponse, Integer> {
}
