package com.suyatna.submisi_android_pemula_suyatna;

import android.os.Parcel;
import android.os.Parcelable;

public class ScoutRegiment implements Parcelable {
    private String name, alias, species, gender, age, photo, description, birthplace;

    public ScoutRegiment() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.alias);
        dest.writeString(this.species);
        dest.writeString(this.gender);
        dest.writeString(this.age);
        dest.writeString(this.photo);
        dest.writeString(this.description);
        dest.writeString(this.birthplace);
    }

    protected ScoutRegiment(Parcel in) {
        this.name = in.readString();
        this.alias = in.readString();
        this.species = in.readString();
        this.gender = in.readString();
        this.age = in.readString();
        this.photo = in.readString();
        this.description = in.readString();
        this.birthplace = in.readString();
    }

    public static final Parcelable.Creator<ScoutRegiment> CREATOR = new Parcelable.Creator<ScoutRegiment>() {
        @Override
        public ScoutRegiment createFromParcel(Parcel source) {
            return new ScoutRegiment(source);
        }

        @Override
        public ScoutRegiment[] newArray(int size) {
            return new ScoutRegiment[size];
        }
    };
}
