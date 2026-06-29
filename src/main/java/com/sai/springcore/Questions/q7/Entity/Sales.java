package com.sai.springcore.Questions.q7.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.NamedEntityGraph;
import jakarta.persistence.Table;
import jakarta.persistence.*;

@Entity
@Table(name="sales")
public class Sales {
    @Id
    private int sale_id;

}
