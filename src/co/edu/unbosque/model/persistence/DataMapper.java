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
	public static ArrayList<Helado> convertirListaHeladoDTOaListaHelado(ArrayList<HeladoDTO> dtoList) {
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
}
