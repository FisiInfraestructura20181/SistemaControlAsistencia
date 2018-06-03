package edu.sistemas.unmsm.asistenciasprofesor.model;

public class DashboardModel {
	
	private int nroCursos;
	
	private String proxCurso;

	public int getNroCursos() {
		return nroCursos;
	}

	public void setNroCursos(int nroCursos) {
		this.nroCursos = nroCursos;
	}

	public String getProxCurso() {
		return proxCurso;
	}

	public void setProxCurso(String proxCurso) {
		this.proxCurso = proxCurso;
	}

	@Override
	public String toString() {
		return "DashboardModel [nroCursos=" + nroCursos + ", proxCurso=" + proxCurso + "]";
	}
}
