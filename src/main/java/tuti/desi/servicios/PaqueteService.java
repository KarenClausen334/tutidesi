package tuti.desi.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.Ciudad;
import tuti.desi.accesoDatos.Paquete;
import tuti.desi.repositorio.PaqueteRepo;

@Service
public class PaqueteService {

	@Autowired
	public PaqueteRepo paqueteRepositorio;

	public void registrarPaquete(Ciudad origen, Ciudad destino, boolean fragil, String dniRemitente,
			String dniDestinatario) {

		Paquete paquete = new Paquete();

		paquete.setOrigen(origen);
		paquete.setDestino(destino);
		paquete.setFragil(fragil);
		paquete.setDniRemitente(dniRemitente);
		paquete.setDniDestinatario(dniDestinatario);

		paqueteRepositorio.save(paquete);
	}
}
