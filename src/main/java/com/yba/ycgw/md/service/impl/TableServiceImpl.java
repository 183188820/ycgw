package com.yba.ycgw.md.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yba.ycgw.md.domain.Table;
import com.yba.ycgw.md.service.TableService;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class TableServiceImpl implements TableService {

    @Override
    public List<Table> tableList() throws IOException {
        File file = new File("E:\\234\\data.json");
        ObjectMapper mapper = new ObjectMapper();
       List<Table> list = mapper.readValue(file, new TypeReference<List<Table>>() {});
        System.out.println(list.size()+"=========123");
        return null;
    }
}
