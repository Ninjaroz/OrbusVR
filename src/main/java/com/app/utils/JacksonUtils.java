package com.app.utils;

import java.io.IOException;
import java.util.List;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JacksonUtils {
	
	private static ObjectMapper mapper = new ObjectMapper();
	private static final Logger logger = LoggerFactory.getLogger(JacksonUtils.class);
			
	public static String getObjString(Object obj){
		try {
			return  mapper.writeValueAsString(obj);
		} catch (JsonGenerationException e) {
			logger.debug(e.getMessage());
			return null;
		} catch (JsonMappingException e) {
			logger.debug(e.getMessage());
			return null;
		} catch (IOException e) {
			logger.debug(e.getMessage());
			return null;
		}
	}
	
	public static <T> T getObj( String json, Class<T> className) {
			try {
				return mapper.readValue(json, className);
			} catch (JsonParseException e) {
				logger.debug(e.getMessage());
				return null;
			} catch (JsonMappingException e) {
				logger.debug(e.getMessage());
				return null;
			} catch (IOException e) {
				logger.debug(e.getMessage());
				return null;
			}
	}

	public static <T> List<T> getObjLst(String json, Class<T>  className) {
		try {
			return mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, className));
		} catch (JsonParseException e) {
			logger.debug(e.getMessage());
			return null;
		} catch (JsonMappingException e) {
			logger.debug(e.getMessage());
			return null;
		} catch (IOException e) {
			logger.debug(e.getMessage());
			return null;
		}
	}
}
