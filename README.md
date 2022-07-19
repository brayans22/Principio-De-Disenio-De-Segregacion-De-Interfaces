# Principio-De-Disenio-De-Segregacion-De-Interfaces

# Principio-De-Disenio-Unica-Responsabilidad-SOLID-

-> CONCEPTO: Lo que busca este principio es tener las interfaces con la minima cantidad de metodos posibles, para que quien las implemente
             No se vea forzado a implementar metodos que no necesite.


-> COMO SE LOGRA?: Creando varias interfaces

-> EJEMPLO: En este ejemplo vemos que hay 3 interfaces (Impresor, Scaneador, Fotocopiable) las cuales son implementadas por quien las quiera usar
            de esta manera evitamos que el cliente no este forzado a implementar cosas que no necesita
            
            - La clase Impresora tiene la funcion de imprimir, por lo tanto implementa la interfaz impresor.
            - La clase Fotocopiadora tiene la funcion de fotocopiar, por lo tanto, implementa la interfaz fotocopiador.
            - La clase Scannear tiene la funcion de scannear, por lo tanto, implementa la interfaz scanneable.
