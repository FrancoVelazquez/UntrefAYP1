
class AvanzarAlNorteHastaAsteroide {
	void iniciar(){
		
		Nave nave1 = new Nave();
		nave1.despegar();
		
		Radar radarNave1 = nave1.obtenerRadar();
		
		while (radarNave1.escanearNorte () == Espectro.VACIO) {
			
			nave1.avanzarAlNorte();
		}
	}
}
