DESCRIPTION = "WAM demo applications for AGL"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "\
    file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10 \
"

inherit aglwgt

DEPENDS = "zip-native"
RDEPENDS_${PN} = "virtual/webruntime"

PR = "r0"

SRC_URI = "git://github.com/jaragunde/wam-demo-applications.git;branch=master \
    file://0001-Remove-some-webapps.patch"

S = "${WORKDIR}/git"
SRCREV = "c04e9a34db2c4a2e8248c8f2c652b9b8cb32db73"
