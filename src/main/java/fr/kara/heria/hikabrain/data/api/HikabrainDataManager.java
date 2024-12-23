package fr.kara.heria.hikabrain.data.api;

import fr.heriamc.api.data.PersistentDataManager;
import fr.heriamc.api.data.mongo.MongoConnection;
import fr.heriamc.api.data.redis.RedisConnection;

import java.util.UUID;

public class HikabrainDataManager extends PersistentDataManager<UUID, HikabrainData> {

    public HikabrainDataManager(RedisConnection redisConnection, MongoConnection mongoConnection) {
        super(redisConnection, mongoConnection, "hikabrain", "hikabrain");
    }

    @Override
    public HikabrainData getDefault() {
        return new HikabrainData(null, 0,0, 0);
    }

}
