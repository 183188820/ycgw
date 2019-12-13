package com.yba.ycgw.md.service;

import com.yba.ycgw.md.domain.Table;

import java.io.IOException;
import java.util.List;

public interface TableService {

    List<Table> tableList() throws IOException;
}
