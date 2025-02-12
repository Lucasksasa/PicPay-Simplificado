package com.picpay_simplificado.domain.transaction;

import com.picpay_simplificado.domain.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private BigDecimal amount;
    @JoinColumn(name = "sender_id")
    @ManyToOne
    private User sender;
    @JoinColumn(name = "receiver_id")
    @ManyToOne
    private User receiver;
    private LocalDateTime timestamp;
}
