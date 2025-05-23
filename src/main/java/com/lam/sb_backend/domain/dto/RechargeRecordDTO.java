package com.lam.sb_backend.domain.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record RechargeRecordDTO(
        UUID id,
        UUID userId,
        int amountRecharge,
        int currentPokemonCoin,
        LocalDateTime rechargeAt
) {
}
