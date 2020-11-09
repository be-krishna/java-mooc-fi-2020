/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author be-krishna
 */
public class Archive {

    private String identifier;
    private String name;

    public Archive(String archiveIdentifier, String archiveName) {
        this.identifier = archiveIdentifier;
        this.name = archiveName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Archive)) {
            return false;
        }

        Archive comparedObj = (Archive) obj;

        if (this.identifier.equals(comparedObj.identifier)) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }

}
