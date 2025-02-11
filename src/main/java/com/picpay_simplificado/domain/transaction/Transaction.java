package com.picpay_simplificado.domain.transaction;

import com.picpay_simplificado.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Data
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @JoinColumn(name = "sender_id")
    @ManyToOne
    private User sender;
    @JoinColumn(name = "receiver_id")
    @ManyToOne
    private User receiver;
    private LocalDateTime timestamp;
}
