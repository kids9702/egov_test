package egovframework.let.main.dao;

import java.util.List;

import egovframework.let.main.vo.IntteVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface EgovMainDAO {
	
	public List<EgovMap> getIntteClsList(IntteVO vo) throws Exception;
	
}
