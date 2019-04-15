package HorarioTeste;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.GregorianCalendar;

public class HorarioTeste {

    public static void main(String[] args) {

                 
         
        //Pegando o horário local da máquina
        Locale horarioLocal = new Locale("pt","BR");
        //Acicionado o calendario
        GregorianCalendar calendario = new GregorianCalendar();
        //Formatando o horário
        SimpleDateFormat horarioFormatado = new SimpleDateFormat("dd' de 'MMMMM' de 'yyyy' - 'HH':'mm'h'",horarioLocal);
          
        //Saida dos horarios
        System.out.println(horarioFormatado.format(calendario.getTime()));

    }

}
