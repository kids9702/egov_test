package egovframework.let.main.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.let.main.dao.EgovMainDAO;
import egovframework.let.main.vo.IntteVO;
import egovframework.rte.psl.dataaccess.util.EgovMap;

@Service("EgovMainService")
public class EgovMainServiceImpl implements EgovMainService{
	
	@Resource(name = "EgovMainDAO")
	private EgovMainDAO mainDAO;
	
	@Override
	public List<EgovMap> getIntteClsList(IntteVO vo) throws Exception {
		return mainDAO.getIntteClsList(vo);
	}

}
