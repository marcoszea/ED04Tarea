public class cuenta1 {

	/*
		Esto es un comentario de ejemplo para el ejercicio 8 :)
		@author MarcosZea
	*/
	
    private String nombre;
    protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getCuenta() {
		return cuenta;
	}

	protected void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	protected double getSaldo() {
		return saldo;
	}

	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	protected double getTipoInter√() {
		return tipoInter√;
	}

	protected void setTipoInter√(double tipoInter√) {
		this.tipoInter√ = tipoInter√;
	}

	private String cuenta;
    private double saldo;
    private double tipoInter√;

    public cuenta1()
    {
    }

    public cuenta1(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
