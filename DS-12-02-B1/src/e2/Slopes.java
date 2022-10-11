 package e2;



  public class Slopes {
     public static int downTheSlope(char[][] slopeMap, int right, int down) {
         int derecha = 0, abajo = 0, trees = 0, derechaaux = right, abajoaux = down, aux;
         boolean p = false, l = false;
         for (int k = 0; k < slopeMap.length; k++) {
             if (right > slopeMap.length-1 || right < 1)
                 throw new IllegalArgumentException();
             if (down > slopeMap.length-1 || down < 1)
                 throw new IllegalArgumentException();
             if (slopeMap.length != slopeMap[k].length)
                 throw new IllegalArgumentException();
             for (int q = 0; q < slopeMap.length; q++) {
                 if (slopeMap[k][q] != '.' && slopeMap[k][q] != '#')
                     throw new IllegalArgumentException();
             }
         }
        while (!p) {
            for (int i = derecha; i < derechaaux; i++) {
                if (i == slopeMap[0].length-1) {
                    if (slopeMap[abajo][derecha] == '#')
                        trees++;
                    aux = derechaaux - i- 1;
                    if (aux==0)
                        l=true;
                    derechaaux = aux;
                    i = 0;
                    derecha = 0;
                }
                    if (l) {
                        if (slopeMap[abajo][derecha] == '#')
                            trees++;
                        break;
                    }
                    else {
                        if (slopeMap[abajo][derecha] == '#')
                            trees++;
                        derecha++;
                    }
            }
            derechaaux += right;
            for (int j = abajo; j < abajoaux; j++) {
                 if (abajo >= slopeMap[0].length-1) {
                     if (slopeMap[abajo][derecha] == '#')
                         trees++;
                     p = true;
                 }
                else {
                     if (slopeMap[abajo][derecha] == '#')
                         trees++;
                     abajo++;
                 }
                if(p)
                    break;
            }
            abajoaux += down;
        }
         return trees;
    }

    public static int jumpTheSlope(char [][] slopeMap , int right , int down) {
        int derecha = 0, abajo = 0, trees = 0, derechaaux = right, abajoaux = down, aux;
        boolean p = false, l = false;
        for (int k = 0; k < slopeMap.length; k++) {
            if (right > slopeMap.length-1 || right < 1)
                throw new IllegalArgumentException();
            if (down > slopeMap.length-1 || down < 1)
                throw new IllegalArgumentException();
            if (slopeMap.length != slopeMap[k].length)
                throw new IllegalArgumentException();
            for (int q = 0; q < slopeMap.length; q++) {
                if (slopeMap[k][q] != '.' && slopeMap[k][q] != '#')
                    throw new IllegalArgumentException();
            }
        }
        if (slopeMap[abajo][derecha] == '#')
            trees++;
        while (!p) {
            for (int i = derecha; i < derechaaux; i++) {
                if (i == slopeMap[0].length-1) {
                    aux = derechaaux - i- 1;
                    if (aux==0)
                        l=true;
                    derechaaux = aux;
                    i = 0;
                    derecha = 0;
                }
                if (l) {
                    break;
                }
                else {
                    derecha++;
                }
            }
            derechaaux += right;
            for (int j = abajo; j < abajoaux; j++) {
                if (abajo >= slopeMap[0].length-1) {
                    p = true;
                }
                else {
                    abajo++;
                    if (j==abajoaux-1)
                        if (slopeMap[abajo][derecha] == '#')
                            trees++;
                }
                if(p)
                    break;
            }
            abajoaux += down;
        }
        return trees;
    }

    }