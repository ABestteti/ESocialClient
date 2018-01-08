package br.com.acaosistemas.main;

import br.com.acaosistemas.ubiesocial.service.UBIESocialService;

public class EsocialClient {

	private UBIESocialService eSocialService;
	
	public EsocialClient() {
	}
	
	public void ubiEnviarLoteEvento() {
		eSocialService = new UBIESocialService();
		// Lote da Acao
		String enviarLoteAcao = eSocialService.enviarLote(1801071735303102480L);
		
		// Lote da Agens
		String enviarLoteAgens =eSocialService.enviarLote(1801071735303102480L);
	}

	public static void main(String[] args) {
		EsocialClient eSocialClient = new EsocialClient();
		eSocialClient.ubiEnviarLoteEvento();
	}   
}
