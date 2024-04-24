package Exercicio1_2_3_4_5;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ParticipanteObjectOutputStream extends ObjectOutputStream{
    public ParticipanteObjectOutputStream(OutputStream out) throws {
        super(out);
    }
    
}

@Override
public void writeStreamHeader() {
    throws IOException{

    }
}