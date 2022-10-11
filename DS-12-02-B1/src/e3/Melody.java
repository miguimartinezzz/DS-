package e3;

 import java.util.ArrayList;
 import java.util.Objects;

public class Melody {


    public enum Notes {
        DO, RE, MI, FA, SOL, LA, SI
    }

    public enum Accidentals {
        NATURAL, SHARP, FLAT
    }

    ArrayList<Notes> Notas;
    ArrayList<Accidentals> Accidentales;
    ArrayList<Float> Times;

    public Melody() {
        Notas=new ArrayList<Notes>();
        Accidentales=new ArrayList<Accidentals>();
        Times=new ArrayList<Float>();
    }

    public void addNote(Notes note, Accidentals accidental, float time) {
        if ((note == null) || (accidental == null) || time == 0f) {
            throw new IllegalArgumentException();
        }
        Notas.add(note);
        Accidentales.add(accidental);
        Times.add(time);
    }

    public Notes getNote(int index) {
        if (index >= Notas.size()) {
            throw new IllegalArgumentException();
        }
        return Notas.get(index);
    }

    public Accidentals getAccidental(int index) {
        if (index > Accidentales.size()) {
            throw new IllegalArgumentException();
        }
        return Accidentales.get(index);
    }

    public float getTime(int index) {
        if (index > Times.size()) {
            throw new IllegalArgumentException();
        }
        return Times.get(index);
    }

    public int size() {
        return Notas.size();
    }


    public float getDuration() {
        float totalTime = 0;
        for (int i = 0; i < Times.size(); i++) {
            if (Times.get(i) > 0)
                totalTime += Times.get(i);
        }
        return totalTime;
    }


    @Override
    public String toString() {
        String melody = new String("");
        for (int j = 0; j < Notas.size(); j++) {
            melody = melody + Notas.get(j);
            if (Accidentales.get(j) == Accidentals.SHARP)
                melody = melody + '#';
            if (Accidentales.get(j) == Accidentals.FLAT)
                melody = melody + 'b';
            melody = melody + "(" + Times.get(j) + ")";
            if (j < Notas.size() - 1)
                melody = melody + " ";
        }
        return melody;
    }

    @Override
    public boolean equals(Object o) {
        int aux = 0;
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Melody melody = (Melody) o;
        for (int i = 0; i < melody.Notas.size(); i++) {
            if (melody.Notas.size() != this.Notas.size())
                return false;

            if (Objects.equals(this.Times.get(i), melody.Times.get(i))) {

                if ((this.Notas.get(i) == melody.Notas.get(i)) && (this.Accidentales.get(i) == melody.Accidentales.get(i)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.DO) && (this.Accidentales.get(i) == Accidentals.SHARP)) && ((melody.Notas.get(i) == Notes.RE) && (melody.Accidentales.get(i) == Accidentals.FLAT)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.RE) && (this.Accidentales.get(i) == Accidentals.FLAT)) && ((melody.Notas.get(i) == Notes.DO) && (melody.Accidentales.get(i) == Accidentals.SHARP)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.RE) && (this.Accidentales.get(i) == Accidentals.SHARP)) && ((melody.Notas.get(i) == Notes.MI) && (melody.Accidentales.get(i) == Accidentals.FLAT)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.MI) && (this.Accidentales.get(i) == Accidentals.FLAT)) && ((melody.Notas.get(i) == Notes.RE) && (melody.Accidentales.get(i) == Accidentals.SHARP)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.MI) && (this.Accidentales.get(i) == Accidentals.NATURAL)) && ((melody.Notas.get(i) == Notes.FA) && (melody.Accidentales.get(i) == Accidentals.FLAT)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.FA) && (this.Accidentales.get(i) == Accidentals.FLAT)) && ((melody.Notas.get(i) == Notes.MI) && (melody.Accidentales.get(i) == Accidentals.NATURAL)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.MI) && (this.Accidentales.get(i) == Accidentals.SHARP)) && ((melody.Notas.get(i) == Notes.FA) && (melody.Accidentales.get(i) == Accidentals.NATURAL)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.FA) && (this.Accidentales.get(i) == Accidentals.NATURAL)) && ((melody.Notas.get(i) == Notes.MI) && (melody.Accidentales.get(i) == Accidentals.SHARP)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.FA) && (this.Accidentales.get(i) == Accidentals.SHARP)) && ((melody.Notas.get(i) == Notes.SOL) && (melody.Accidentales.get(i) == Accidentals.FLAT)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.SOL) && (this.Accidentales.get(i) == Accidentals.FLAT)) && ((melody.Notas.get(i) == Notes.FA) && (melody.Accidentales.get(i) == Accidentals.SHARP)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.SOL) && (this.Accidentales.get(i) == Accidentals.SHARP)) && ((melody.Notas.get(i) == Notes.LA) && (melody.Accidentales.get(i) == Accidentals.FLAT)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.LA) && (this.Accidentales.get(i) == Accidentals.FLAT)) && ((melody.Notas.get(i) == Notes.SOL) && (melody.Accidentales.get(i) == Accidentals.SHARP)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.LA) && (this.Accidentales.get(i) == Accidentals.SHARP)) && ((melody.Notas.get(i) == Notes.SI) && (melody.Accidentales.get(i) == Accidentals.FLAT)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.SI) && (this.Accidentales.get(i) == Accidentals.FLAT)) && ((melody.Notas.get(i) == Notes.LA) && (melody.Accidentales.get(i) == Accidentals.SHARP)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.SI) && (this.Accidentales.get(i) == Accidentals.NATURAL)) && ((melody.Notas.get(i) == Notes.DO) && (melody.Accidentales.get(i) == Accidentals.FLAT)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.DO) && (this.Accidentales.get(i) == Accidentals.FLAT)) && ((melody.Notas.get(i) == Notes.SI) && (melody.Accidentales.get(i) == Accidentals.NATURAL)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.SI) && (this.Accidentales.get(i) == Accidentals.SHARP)) && ((melody.Notas.get(i) == Notes.DO) && (melody.Accidentales.get(i) == Accidentals.NATURAL)))
                    aux++;
                else if (((this.Notas.get(i) == Notes.DO) && (this.Accidentales.get(i) == Accidentals.NATURAL)) && ((melody.Notas.get(i) == Notes.SI) && (melody.Accidentales.get(i) == Accidentals.SHARP)))
                    aux++;

            }
        }
        return melody.Notas.size() == aux;
    }


  @Override
    public int hashCode() {
        final int prime = 31;
        int resultado = 1;
        resultado = prime * resultado + ((Times == null) ? 0 : Times.hashCode());
        for(int i = 0; i < Notas.size(); i++){
            if (((this.Notas.get(i) == Notes.DO) && (this.Accidentales.get(i) == Accidentals.SHARP)) || ((this.Notas.get(i) == Notes.RE) && (this.Accidentales.get(i) == Accidentals.FLAT)))
                resultado+=1;
            if (((this.Notas.get(i) == Notes.RE) && (this.Accidentales.get(i) == Accidentals.SHARP)) || ((this.Notas.get(i) == Notes.MI) && (this.Accidentales.get(i) == Accidentals.FLAT)))
                resultado+=1;
            if (((this.Notas.get(i) == Notes.MI) && (this.Accidentales.get(i) == Accidentals.NATURAL)) || ((this.Notas.get(i) == Notes.FA) && (this.Accidentales.get(i) == Accidentals.FLAT)))
                resultado+=3;
            if (((this.Notas.get(i) == Notes.MI) && (this.Accidentales.get(i) == Accidentals.SHARP)) || ((this.Notas.get(i) == Notes.FA) && (this.Accidentales.get(i) == Accidentals.NATURAL)))
                resultado+= 3;
            if (((this.Notas.get(i) == Notes.FA) && (this.Accidentales.get(i) == Accidentals.SHARP)) || ((this.Notas.get(i) == Notes.SOL) && (this.Accidentales.get(i) == Accidentals.FLAT)))
                resultado+= 5;
            if (((this.Notas.get(i) == Notes.SOL) && (this.Accidentales.get(i) == Accidentals.SHARP)) || ((this.Notas.get(i) == Notes.LA) && (this.Accidentales.get(i) == Accidentals.FLAT)))
                resultado+= 5;
            if (((this.Notas.get(i) == Notes.LA) && (this.Accidentales.get(i) == Accidentals.SHARP)) || ((this.Notas.get(i) == Notes.SI) && (this.Accidentales.get(i) == Accidentals.FLAT)))
                resultado+= 7;
            if (((this.Notas.get(i) == Notes.DO) && (this.Accidentales.get(i) == Accidentals.FLAT)) || ((this.Notas.get(i) == Notes.SI) && (this.Accidentales.get(i) == Accidentals.SHARP)))
                resultado+= 7;
            if (((this.Notas.get(i) == Notes.DO) && (this.Accidentales.get(i) == Accidentals.NATURAL)) || ((this.Notas.get(i) == Notes.SI) && (this.Accidentales.get(i) == Accidentals.SHARP)))
                resultado+= 11;

        }
        return resultado;
    }
}




