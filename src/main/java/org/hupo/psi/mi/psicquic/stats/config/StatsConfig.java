package org.hupo.psi.mi.psicquic.stats.config;

/**
 * Basic configuration holder.
 *
 * @author Samuel Kerrien (skerrien@ebi.ac.uk)
 * @version $Id$
 * @since 0.1
 */
public class StatsConfig {

    private String psicquicRegistryUrl;
    private String interactionMiqlQuery;
    private String publicationMiqlQuery;

    public StatsConfig() {
    }

    public String getPsicquicRegistryUrl() {
        return psicquicRegistryUrl;
    }

    public void setPsicquicRegistryUrl(String psicquicRegistryUrl) {
        this.psicquicRegistryUrl = psicquicRegistryUrl;
    }

    public String getInteractionMiqlQuery() {
        return interactionMiqlQuery;
    }

    public void setInteractionMiqlQuery(String interactionMiqlQuery) {
        this.interactionMiqlQuery = interactionMiqlQuery;
    }

    public String getPublicationMiqlQuery() {
        return publicationMiqlQuery;
    }

    public void setPublicationMiqlQuery(String publicationMiqlQuery) {
        this.publicationMiqlQuery = publicationMiqlQuery;
    }

    @Override
    public String toString() {
        return "StatsConfig{" +
                "psicquicRegistryUrl='" + psicquicRegistryUrl + '\'' +
                ", interactionMiqlQuery='" + interactionMiqlQuery + '\'' +
                ", publicationMiqlQuery='" + publicationMiqlQuery + '\'' +
                '}';
    }
}
