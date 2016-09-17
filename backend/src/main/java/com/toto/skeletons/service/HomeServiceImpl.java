package com.toto.skeletons.service;

import com.toto.skeletons.model.ResultDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HomeServiceImpl implements HomeService {

    private static final Logger LOGGER = LoggerFactory.getLogger(HomeServiceImpl.class);

    @Override
    public ResultDTO createResultDTO() {
        ResultDTO result = new ResultDTO();
        result.setCurrentDate(new Date());
        result.setVersionNumber("1.0.0");
        result.setMessage("Hello World");
        return result;
    }

}
