package oop_basics;


import java.util.Objects;

public class Pen {
    private PenMaterial penMaterial;
    private LnkColor lnkColor;
    private Construction construction;

    public Pen(PenMaterial penMaterial, LnkColor lnkColor, Construction construction) {
        this.penMaterial = penMaterial;
        this.lnkColor = lnkColor;
        this.construction = construction;
    }

    public PenMaterial getPenMaterial() {
        return penMaterial;
    }

    public void setPenMaterial(PenMaterial penMaterial) {
        this.penMaterial = penMaterial;
    }

    public LnkColor getLnkColor() {
        return lnkColor;
    }

    public void setLnkColor(LnkColor lnkColor) {
        this.lnkColor = lnkColor;
    }

    public Construction getConstruction() {
        return construction;
    }

    public void setConstruction(Construction construction) {
        this.construction = construction;
    }

    @Override
    public boolean equals(Object objInput) {
        if (this == objInput) {
            return true;
        }
        if (!(objInput instanceof Pen)) {
            return false;
        }
        Pen thisPen = (Pen) objInput;
        return this.lnkColor.equals(thisPen.lnkColor) &&
                this.construction.equals(thisPen.construction) &&
                this.penMaterial.equals(thisPen.penMaterial);
    }

    @Override
    public int hashCode() {

        return Objects.hash(penMaterial, lnkColor, construction);
    }

    @Override
    public String toString() {
        return "Pen [penMaterial= " + penMaterial + ", lnkColor= " + lnkColor + ", construction= " + construction + "]";
    }
}
