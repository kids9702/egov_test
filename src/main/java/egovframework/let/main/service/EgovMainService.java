package egovframework.let.main.service;

import java.util.List;

import egovframework.let.main.vo.IntteVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface EgovMainService {
	
	public List<EgovMap> getIntteClsList(IntteVO vo) throws Exception;
	
}
