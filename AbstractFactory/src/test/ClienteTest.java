package test;

import org.junit.jupiter.api.Test;
import padrao.abstractfactory.*;

import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {
    @Test
    void deveAbastecerCarroCombustao() {
        FabricaAbstrata fabrica = new FabricaCombustao();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Carro Combustao abastecido", cliente.abastecerCarro());
    }

    @Test
    void deveAbastecerCarroEletrico() {
        FabricaAbstrata fabrica = new FabricaEletrica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Carro Eletrico abastecido", cliente.abastecerCarro());
    }

    @Test
    void deveAbastecerMotoCombustao() {
        FabricaAbstrata fabrica = new FabricaCombustao();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Moto Combustao abastecida", cliente.abastecerMoto());
    }

    @Test
    void deveAbastecerMotoEletrica() {
        FabricaAbstrata fabrica = new FabricaEletrica();
        Cliente cliente = new Cliente(fabrica);
        assertEquals("Moto Eletrica abastecida", cliente.abastecerMoto());
    }
}
