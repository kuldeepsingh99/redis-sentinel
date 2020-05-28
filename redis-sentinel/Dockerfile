FROM redis

EXPOSE 26379
ENV SENTINEL_QUORUM 2
ENV SENTINEL_DOWN_AFTER 3000
ENV SENTINEL_FAILOVER 3000
ADD sentinel.conf /etc/redis/sentinel.conf
RUN chown redis:redis /etc/redis/sentinel.conf
ADD sentinel-entrypoint.sh /usr/local/bin/
RUN chmod +x /usr/local/bin/sentinel-entrypoint.sh
ENTRYPOINT ["sentinel-entrypoint.sh"]