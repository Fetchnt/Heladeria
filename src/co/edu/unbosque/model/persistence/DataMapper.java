package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Helado; 
import co.edu.unbosque.model.HeladoDTO; 

public class DataMapper {

	public static ArrayList<HeladoDTO> convertirListaHeladoAListaHeladoDTO(ArrayList<Helado> entityList) {
		ArrayList<HeladoDTO> dtoList = new ArrayList<HeladoDTO>();
		
		for (Helado helado : entityList) {
			HeladoDTO dto = new HeladoDTO();
			dto.setNombreProducto(helado.getNombreProducto());
			dto.setCantidadProducto(helado.getCantidadProducto());
			dto.setPrecioProducto(helado.getPrecioProducto());
			dto.setSaborBolas(helado.getSaborBolas());
			dtoList.add(dto);
		}
		return dtoList;
	}
	public static ArrayList<Helado> convertirListaHeladoDTOaListaDTO(ArrayList<HeladoDTO> dtoList) {
		ArrayList<Helado> entityList = new ArrayList<Helado>();
		for(HeladoDTO heladoDTO : dtoList) {
			Helado entity = new Helado();
			entity.setNombreProducto(heladoDTO.getNombreProducto());
			entity.setCantidadProducto(heladoDTO.getCantidadProducto());
			entity.setPrecioProducto(heladoDTO.getPrecioProducto());
			entity.setSaborBolas(heladoDTO.getSaborBolas());
			entityList.add(entity);
		}
		return entityList;
	}
	
	// CONVERTIDORES DE HELADODTO A HELADO/ HELADO A HELADODTO
		public static Helado convertirHeladoDTOaHelado(HeladoDTO dto) {
			Helado entity = new Helado();
			entity.setNombreProducto(dto.getNombreProducto());
			entity.setCantidadProducto(dto.getCantidadProducto());
			entity.setPrecioProducto(dto.getPrecioProducto());
			entity.setSaborBolas(dto.getSaborBolas());
			return entity;
		}

		public static HeladoDTO convertirHeladoAHeladoDTO(Helado entity) {
			HeladoDTO dto = new HeladoDTO();
			dto.setNombreProducto(entity.getNombreProducto());
			dto.setCantidadProducto(entity.getCantidadProducto());
			dto.setPrecioProducto(entity.getPrecioProducto());
			dto.setSaborBolas(entity.getSaborBolas());
			return dto;
		}
}
