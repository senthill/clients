package com.example.clients;


/**
 * Created by senthil on 2/2/17.
 */
public class Client {


    private String clientId;

    private String legalName;
    private String longName;
    private String shortName;
    private String previousName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        return clientId.equals(client.clientId);
    }

    @Override
    public int hashCode() {
        return clientId.hashCode();
    }

    private String businessSegment;

    public String getClientId() {
        return clientId;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPreviousName() {
        return previousName;
    }

    public void setPreviousName(String previousName) {
        this.previousName = previousName;
    }

    public String getBusinessSegment() {
        return businessSegment;
    }

    public void setBusinessSegment(String businessSegment) {
        this.businessSegment = businessSegment;
    }

    public String getDomicleCountry() {
        return domicleCountry;
    }

    public void setDomicleCountry(String domicleCountry) {
        this.domicleCountry = domicleCountry;
    }

    public String getLegalConstitution() {
        return legalConstitution;
    }

    public void setLegalConstitution(String legalConstitution) {
        this.legalConstitution = legalConstitution;
    }

    private String domicleCountry;
    private String legalConstitution;

    public Client(String clientId) {
        this.clientId = clientId;
    }
}
