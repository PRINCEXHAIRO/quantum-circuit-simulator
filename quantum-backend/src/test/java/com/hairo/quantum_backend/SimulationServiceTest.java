package com.hairo.quantum_backend;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.hairo.quantum_backend.service.SimulationService;
import java.util.List;


public class SimulationServiceTest {
    void testHadamardGate() {

        SimulationService service = new SimulationService();

        double[] result = service.simulate(List.of("H"));

        assertEquals(0.5, result[0], 0.0001);
        assertEquals(0.5, result[1], 0.0001);
    }
    @Test
    void testXGate() {

    SimulationService service = new SimulationService();

    double[] result = service.simulate(List.of("X"));

        assertEquals(0.0, result[0], 0.0001);
        assertEquals(1.0, result[1], 0.0001);
    }
    @Test
    void testDoubleXGate() {

    SimulationService service = new SimulationService();

    double[] result = service.simulate(List.of("X","X"));

        assertEquals(1.0, result[0], 0.0001);
        assertEquals(0.0, result[1], 0.0001);
    }
    @Test
    void testMixedGate() {

    SimulationService service = new SimulationService();

    double[] result = service.simulate(List.of("H","X","H"));

        assertEquals(1.0, result[0], 0.0001);
        assertEquals(0.0, result[1], 0.0001);
    }

    
}
