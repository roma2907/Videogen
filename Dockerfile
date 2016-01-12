FROM          jdubois/jhipster-docker

ENV FFMPEG_VERSION=2.8.3 \
    X264_VERSION=snapshot-20151212-2245-stable

RUN apt-get update \
 && DEBIAN_FRONTEND=noninteractive apt-get install -y bzip2 libgnutlsxx27 libogg0 libjpeg8 libpng12-0 \
      libvpx1 libtheora0 libxvidcore4 libmpeg2-4 \
      libvorbis0a libfaad2 libmp3lame0 libmpg123-0 libmad0 libopus0 libvo-aacenc0 \
 && rm -rf /var/lib/apt/lists/*

COPY install.sh /var/cache/ffmpeg/install.sh
RUN bash /var/cache/ffmpeg/install.sh

CMD "mvn"
