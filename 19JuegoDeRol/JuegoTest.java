package oo1.ej19JuegosDeRolOO2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class JuegoTest {
	private Director director = new Director();
	private Builder magoBuilder = new MagoBuilder();
	private Builder guerreroBuilder= new GuerreroBuilder();
	private Builder arqueroBuilder= new ArqueroBuilder();
	private Builder thoorBuilder = new ThoorBuilder();
	private Mago mago;
	private Mago mago2;
	private Guerrero guerrero;
	private Guerrero guerrero2;
	private Arquero arquero;
	private Arquero arquero2;
	private Thoor thoor;
	private Thoor thoor2;
	
	@BeforeEach
	void setUp() {
		//Construccion de Mago
		director.setBuilder(magoBuilder);
		this.mago = (Mago) this.director.construirPersonaje("Mago");
		this.mago2 = (Mago) this.director.construirPersonaje("Mago2");
		
		//Construccion de Arquero
		director.setBuilder(arqueroBuilder);
		this.arquero = (Arquero) this.director.construirPersonaje("Arquero");
		this.arquero2 = (Arquero) this.director.construirPersonaje("Arquero2");
		
		//Construccion de Guerrero
		director.setBuilder(guerreroBuilder);
		this.guerrero = (Guerrero) this.director.construirPersonaje("Guerrero");
		this.guerrero2 = (Guerrero) this.director.construirPersonaje("Guerrero2");
		
		//Construccion de Thoor
		director.setBuilder(thoorBuilder);
		this.thoor = (Thoor) this.director.construirPersonaje("Thoor");
		this.thoor2 = (Thoor) this.director.construirPersonaje("Thoor2");
	}

	@Test
	void testPeleaMagoContraOtro() {
		for(int i= 0; i<100; i++) {
			assertEquals("Mago ataca a Guerrero y causa 1 de daño", this.mago.pelearContra(this.guerrero));
		}
		assertEquals("Mago ataca a Arquero y causa 2 de daño", this.mago.pelearContra(arquero));
		assertEquals(98, this.arquero.vida);
		assertEquals("Este personaje esta muerto", this.guerrero.pelearContra(mago));
		assertEquals(0,this.guerrero.vida); 
		assertEquals("Mago ataca a Mago2 y causa 2 de daño", this.mago.pelearContra(mago2));
		assertEquals(98,this.mago2.vida);
	}
	
	@Test
	void testPeleaGuerreroContraOtro() {
		assertEquals("Guerrero ataca a Mago y causa 8 de daño", this.guerrero.pelearContra(mago));
		assertEquals(92, this.mago.vida);
		assertEquals("Guerrero ataca a Arquero y causa 8 de daño", this.guerrero.pelearContra(arquero));
		assertEquals(92, this.arquero.vida);
		assertEquals("Guerrero ataca a Guerrero2 y causa 3 de daño", this.guerrero.pelearContra(guerrero2));
		assertEquals(97, this.guerrero2.vida);
	}
	
	@Test
	void testPeleaArqueroContraOtro() {
		assertEquals("Arquero ataca a Mago y causa 5 de daño", this.arquero.pelearContra(mago));
		assertEquals(95,this.mago.vida);
		assertEquals("Arquero ataca a Guerrero y causa 2 de daño", this.arquero.pelearContra(guerrero));
		assertEquals(98,this.guerrero.vida);
		assertEquals("Arquero ataca a Arquero2 y causa 5 de daño", this.arquero.pelearContra(arquero2));
		assertEquals(95,this.arquero2.vida);
	}
	
	@Test
	void testPeleaThoorContraOtro() {
		assertEquals("Thoor ataca a Mago y causa 10 de daño", this.thoor.pelearContra(mago));
		assertEquals(90,this.mago.vida);
		assertEquals("Thoor ataca a Arquero y causa 10 de daño", this.thoor.pelearContra(arquero));
		assertEquals(90,this.arquero.vida);
		assertEquals("Thoor ataca a Guerrero y causa 4 de daño", this.thoor.pelearContra(guerrero));
		assertEquals(96,this.guerrero.vida);
		assertEquals("Thoor ataca a Thoor2 y causa 5 de daño", this.thoor.pelearContra(thoor2));
		assertEquals(95,this.thoor2.vida);
	}
}
