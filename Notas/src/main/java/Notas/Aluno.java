package Notas;

public class Aluno {

    private String nome;
    private double grauA;
	private double grauB;
	private double média;
	
    public Aluno(String nome)
    {
        this.nome = nome;
        this.grauA = grauA;
		this.grauB = grauB;
		this.média = média;		
	}


	public double getMedia() {
		return this.média;
	}

    public String getNome() {
		return this.nome;
	}

	public double getGrauA() {
		return this.grauA;
	}

	public double getGrauB() {
		return this.grauB;
	}


	
	public void adicionaNotas(double grauA, double grauB)
	{
		this.grauA = grauA;
		this.grauB = grauB;
	}

	public void calculaMedia()
	{
		this.média = (this.grauA+this.grauB)/2;
	}

	public double maiorNota()
	{
		if(this.grauA > this.grauB)
		{
			return this.grauA;
		}
		else
		{
			return this.grauB;
		}
	}

	public double menorNota()
	{
		if(this.grauA < this.grauB)
		{
			return this.grauA;
		}
		else
		{
			return this.grauB;
		}
	}



    
}