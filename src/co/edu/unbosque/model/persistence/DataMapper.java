package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.Helado;
import co.edu.unbosque.model.HeladoDTO;
import co.edu.unbosque.model.Waffle;
import co.edu.unbosque.model.WaffleDTO;
import co.edu.unbosque.model.Crepe;
import co.edu.unbosque.model.CrepeDTO;

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
		for (HeladoDTO heladoDTO : dtoList) {
			Helado entity = new Helado();
			entity.setNombreProducto(heladoDTO.getNombreProducto());
			entity.setCantidadProducto(heladoDTO.getCantidadProducto());
			entity.setPrecioProducto(heladoDTO.getPrecioProducto());
			entity.setSaborBolas(heladoDTO.getSaborBolas());
			entityList.add(entity);
		}
		return entityList;
	}

	public static ArrayList<WaffleDTO> convertirListaWaffleAListaWaffleDTO(ArrayList<Waffle> entityList) {
		ArrayList<WaffleDTO> dtoList = new ArrayList<WaffleDTO>();
		for (Waffle waffle : entityList) {
			WaffleDTO dto = new WaffleDTO();
			dto.setNombreProducto(waffle.getNombreProducto());
			dto.setCantidadProducto(waffle.getCantidadProducto());
			dto.setPrecioProducto(waffle.getPrecioProducto());
			dto.setTipoDeWaffle(waffle.getTipoDeWaffle());
			dtoList.add(dto);
		}
		return dtoList;
	}

	public static ArrayList<Waffle> convertirListaWaffleDTOAListaWaffle(ArrayList<WaffleDTO> dtoList) {
		ArrayList<Waffle> entityList = new ArrayList<Waffle>();
		for (WaffleDTO waffleDTO : dtoList) {
			Waffle entity = new Waffle();
			entity.setNombreProducto(waffleDTO.getNombreProducto());
			entity.setCantidadProducto(waffleDTO.getCantidadProducto());
			entity.setPrecioProducto(waffleDTO.getPrecioProducto());
			entity.setTipoDeWaffle(waffleDTO.getTipoDeWaffle());
			entityList.add(entity);
		}
		return entityList;
	}

	public static ArrayList<CrepeDTO> convertirListaCrepeAListaCrepeDTO(ArrayList<Crepe> entityList) {
		ArrayList<CrepeDTO> dtoList = new ArrayList<CrepeDTO>();

		for (Crepe crepe : entityList) {
			CrepeDTO dto = new CrepeDTO();
			dto.setNombreProducto(crepe.getNombreProducto());
			dto.setCantidadProducto(crepe.getCantidadProducto());
			dto.setPrecioProducto(crepe.getPrecioProducto());
			dto.setTipoDeCrepe(crepe.getTipoDeCrepe());
			dto.setSalsa(crepe.getSalsa());
			dtoList.add(dto);
		}
		return dtoList;
	}

	public static ArrayList<Crepe> convertirListaCrepeDTOAListaCrepe(ArrayList<CrepeDTO> dtoList) {
		ArrayList<Crepe> entityList = new ArrayList<Crepe>();
		for (CrepeDTO crepeDTO : dtoList) {
			Crepe entity = new Crepe();
			entity.setNombreProducto(crepeDTO.getNombreProducto());
			entity.setCantidadProducto(crepeDTO.getCantidadProducto());
			entity.setPrecioProducto(crepeDTO.getPrecioProducto());
			entity.setTipoDeCrepe(crepeDTO.getTipoDeCrepe());
			entity.setSalsa(crepeDTO.getSalsa());
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

	// CONVERTIDORES DE WAFFLEDTO A WAFFLE / WAFFLE A WAFFLEDTO
	public static Waffle convertirWaffleDTOaWaffle(WaffleDTO dto) {
		Waffle entity = new Waffle();
		entity.setNombreProducto(dto.getNombreProducto());
		entity.setCantidadProducto(dto.getCantidadProducto());
		entity.setPrecioProducto(dto.getPrecioProducto());
		entity.setTipoDeWaffle(dto.getTipoDeWaffle());
		return entity;
	}

	public static WaffleDTO convertirWaffleAWaffleDTO(Waffle entity) {
		WaffleDTO dto = new WaffleDTO();
		dto.setNombreProducto(entity.getNombreProducto());
		dto.setCantidadProducto(entity.getCantidadProducto());
		dto.setPrecioProducto(entity.getPrecioProducto());
		dto.setTipoDeWaffle(entity.getTipoDeWaffle());
		return dto;
	}
	
	// CONVERTIDORES DE CREPEDTO A CREPE / CREPE A CREPEDTO
	public static Crepe convertirCrepeDTOaCrepe(CrepeDTO dto) {
		Crepe entity = new Crepe();
		entity.setNombreProducto(dto.getNombreProducto());
		entity.setCantidadProducto(dto.getCantidadProducto());
		entity.setPrecioProducto(dto.getPrecioProducto());
		entity.setTipoDeCrepe(dto.getTipoDeCrepe());
		entity.setSalsa(dto.getSalsa());
		return entity;
	}

	public static CrepeDTO convertirCrepeACrepeDTO(Crepe entity) {
		CrepeDTO dto = new CrepeDTO();
		dto.setNombreProducto(entity.getNombreProducto());
		dto.setCantidadProducto(entity.getCantidadProducto());
		dto.setPrecioProducto(entity.getPrecioProducto());
		dto.setTipoDeCrepe(entity.getTipoDeCrepe());
		dto.setSalsa(entity.getSalsa());
		return dto;
	}


}
