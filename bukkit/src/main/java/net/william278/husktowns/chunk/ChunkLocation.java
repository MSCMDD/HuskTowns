package net.william278.husktowns.chunk;

import org.jetbrains.annotations.NotNull;

/**
 * @deprecated For API v1 compatibility only. See {@link net.william278.husktowns.claim.Chunk} instead
 */
@Deprecated(since = "2.0")
public class ChunkLocation {
    private final int chunkX;
    private final int chunkZ;
    private final String world;
    private final String server;

    /**
     * Creates a new ChunkLocation
     *
     * @param server ID of the server on the proxy
     * @param world  Name of the world on the server
     * @param x      Chunk grid x position
     * @param z      Chunk grid z position
     * @deprecated For API v1 compatibility only. See {@link net.william278.husktowns.claim.Chunk} instead
     */
    @Deprecated(since = "2.0")
    public ChunkLocation(String server, String world, int x, int z) {
        this.chunkX = x;
        this.chunkZ = z;
        this.world = world;
        this.server = server;
    }

    /**
     * Returns the X position on the chunk grid.
     *
     * @return The X position
     * @deprecated For API v1 compatibility only. See {@link net.william278.husktowns.claim.Chunk} instead
     */
    @Deprecated(since = "2.0")
    public int getChunkX() {
        return chunkX;
    }

    /**
     * Returns the Z position on the chunk grid.
     *
     * @return The Z position
     * @deprecated For API v1 compatibility only. See {@link net.william278.husktowns.claim.Chunk} instead
     */
    @Deprecated(since = "2.0")
    public int getChunkZ() {
        return chunkZ;
    }

    /**
     * Returns the name of the world on the server the chunk is on
     *
     * @return The world name
     * @deprecated For API v1 compatibility only. See {@link net.william278.husktowns.claim.Chunk} instead
     */
    @NotNull
    @Deprecated(since = "2.0")
    public String getWorld() {
        return world;
    }

    /**
     * Returns the ID of the server on the proxy that this chunk is on
     *
     * @return The server ID
     * @deprecated For API v1 compatibility only. See {@link net.william278.husktowns.claim.Chunk} instead
     */
    @NotNull
    @Deprecated(since = "2.0")
    public String getServer() {
        return server;
    }
}
