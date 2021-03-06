package demo.service;


import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;






import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import demo.pojo.Drycargo;
import demo.pojo.InfoOfMahout;
import demo.repo.InfoOfMahoutRepository;
import demo.repo.DrycargoRepository;


@Service
@Component
public class InfoOfMahoutService {
	private static final Logger logger = Logger.getLogger(InfoOfMahoutService.class);
	
	 
	
	@Autowired
	public InfoOfMahoutRepository infoOfMahoutRepository;
	

	public InfoOfMahoutService(){
		super();
	}
	
	/**
	 * 查询某一群下得干货
	 * @param keywords
	 * @param pageable
	 * @return
	 */
	public  InfoOfMahout save(InfoOfMahout d) {
		 
		return infoOfMahoutRepository.save(d); 
		 
	}
	
	
	public List<InfoOfMahout> findall() {
		 
		return infoOfMahoutRepository.findAll(); 
		 
	}
	
	
	public Page<InfoOfMahout> findByusernumber(String unumber,Pageable page) {
		 
		return infoOfMahoutRepository.findByUserid(unumber,page); 
		 
	}
	public void delete() {
		 
		infoOfMahoutRepository.deleteAll(); 
		 
	}
		
}	

