package egovframework.let.main.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import egovframework.let.main.vo.IntteVO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Repository("EgovMainDAO")
public class EgovMainDAOImpl extends EgovAbstractMapper implements EgovMainDAO{

	@Override
	public List<EgovMap> getIntteClsList(IntteVO vo) throws Exception {
		return selectList("EgovMainDAO.selectIntteClsList", vo);
	}

}
