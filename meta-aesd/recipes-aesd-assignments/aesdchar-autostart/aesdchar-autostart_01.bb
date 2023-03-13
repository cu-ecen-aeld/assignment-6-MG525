

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://S97aesdcharmodule"
SRCREV = "1"

FILES:${PN} += "${sysconfdir}/init.d/S97aesdcharmodule"

inherit update-rc.d
INITSCRIPT_PACKAGES = "${PN}"
INITSCRIPT_NAME:${PN} = "S97aesdcharmodule"


do_install() {

    install -d ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/S97aesdcharmodule ${D}${sysconfdir}/init.d/
}