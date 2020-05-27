package iterator;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args) {
        ListArray listaEmpleadosSistema1= new ListArray();

        listaEmpleadosSistema1.add("juan1");
        listaEmpleadosSistema1.add("juan2");
        listaEmpleadosSistema1.add("juan3");
        listaEmpleadosSistema1.add("juan4");
        listaEmpleadosSistema1.add("juan5");

        ListList listaEmpleadosSistema2= new ListList();
        listaEmpleadosSistema2.add("maria1");
        listaEmpleadosSistema2.add("maria2");
        listaEmpleadosSistema2.add("maria3");
        listaEmpleadosSistema2.add("maria4");
        listaEmpleadosSistema2.add("maria5");

        ListVector listaEmpleadosSistema3 = new ListVector();
        listaEmpleadosSistema2.add("josé1");
        listaEmpleadosSistema2.add("josé2");
        listaEmpleadosSistema2.add("josé3");
        listaEmpleadosSistema2.add("josé4");
        listaEmpleadosSistema2.add("josé5");


        Map<Integer, String> m = new HashMap<>();
        Iterator iterator;
        iterator = listaEmpleadosSistema1.iterator();
        int i = 0;
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            m.put(i++,s);
            System.out.println("Se agregó a "+ s + " en el mapa con Key " + i);
        }


        iterator = listaEmpleadosSistema2.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            m.put(i++,s);
            System.out.println("Se agregó a "+ s + " en el mapa con Key " + i);
        }

        iterator = listaEmpleadosSistema3.iterator();
        while (iterator.hasNext()){
            String s = (String) iterator.next();
            m.put(i++,s);
            System.out.println("Se agregó a "+ s + " en el mapa con Key " + i);
        }
    }
}
