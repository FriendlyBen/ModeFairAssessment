package com.ModeFairAssessment.manageProduct.model;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity

public class Variation implements Serializable{
    @Id 
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(nullable=false, updatable = false)
    private int variationId;
    private int productId;
    private String chipType;
    private String cpuType;
    private String gpuType;
    private String memoryType;
    private String storageType;
    private String miscellaneous;
    private String keyboardType;
    private String adapterType;
    private String trackPad;

    private String chipImage;
    public String getChipImage() {
        return chipImage;
    }

    public void setChipImage(String chipImage) {
        this.chipImage = chipImage;
    }

    private String colors;
    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    private String productImages;


    public String getProductImages() {
        return productImages;
    }

    public void setProductImages(String productImages) {
        this.productImages = productImages;
    }

    private Float price;

    public Variation(){}

    public int getVariationId(){
        return variationId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getTrackPad() {
        return trackPad;
    }

    public void setTrackPad(String trackPad) {
        this.trackPad = trackPad;
    }

    public String getChipType(){
        return this.chipType;
    }

    public void setChipType(String chipType){
        this.chipType = chipType;
    }

    public String getMiscellaneous(){
        return this.miscellaneous;
    }

    public void setMiscellaneous(String miscellaneous){
        this.miscellaneous = miscellaneous;
    }

    public String getKeyboardType(){
        return this.keyboardType;
    }

    public void setKeyboardType(String keyboardType){
        this.keyboardType = keyboardType;
    }

    public String getAdapterType(){
        return this.adapterType;
    }

    public void setAdapterType(String adapterType){
        this.adapterType = adapterType;
    }


    public void setVariationId(int variation_id){
        this.variationId = variation_id;
    }

    public String getCPUType(){
        return this.cpuType;
    }

    public void setCPUType(String cpuType){
        this.cpuType = cpuType;
    }

    public String getGPUType(){
        return this.gpuType;
    }

    public void setGPUType(String gpuType){
        this.gpuType = gpuType;
    }

    public String getMemoryType(){
        return memoryType;
    }

    public void setMemoryType(String memoryType){
        this.memoryType = memoryType;
    }

    public String getStorageType(){
        return this.storageType;
    }

    public void setStorageType(String storageType){
        this.storageType = storageType;
    }

    public Float getPrice(){
        return this.price;
    }

    public void setPrice(Float p){
        this.price = p;
    }

    @Override
    public String toString(){
        return "Variation{" +
                "variationId : "+variationId+
                // "ChipType = "+ChipType+
                ", cpuType = "+cpuType+
                ", gpuType = "+gpuType+
                ", memoryType = "+memoryType+
                ", storageType = "+storageType+
                // "Ports = "+Ports+
                // "TouchId = "+TouchId+
                // "AdapterType = "+AdapterType+
                ", Price = "+price+
                // "ImageUrl = "+ImageUrl+
                "}";
    }
}
