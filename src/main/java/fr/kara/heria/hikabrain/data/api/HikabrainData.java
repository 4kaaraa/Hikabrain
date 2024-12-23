package fr.kara.heria.hikabrain.data.api;

import fr.heriamc.api.data.SerializableData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.UUID;

@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
public class HikabrainData implements SerializableData<UUID> {

    private UUID id;
    private int point, kills, deaths;

    @Override
    public UUID getIdentifier() {
        return this.id;
    }

    @Override
    public void setIdentifier(UUID uuid) {
        this.id = uuid;
    }
}
