package com.service;

import java.util.List;
import java.util.Map;

public interface CommonService {

	List<Map<String, Object>> selectListDistinctColumn(Map<String, Object> paraMap);

}
