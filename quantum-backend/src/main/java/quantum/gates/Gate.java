package quantum.gates;

import quantum.math.Qubit;

public interface Gate {
    Qubit apply(Qubit qubit);
}
