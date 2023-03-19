SUMMARY = "ldd misc-modules"
DESCRIPTION = "${SUMMARY}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://git@github.com/cu-ecen-aeld/assignment-7-MG525.git;protocol=ssh;branch=main"
PV = "1.0+git${SRCPV}"
SRCREV = "f987ce9f6a49b27978d7ab244c3f249cbdd5cff5"



S = "${WORKDIR}/git/misc-modules"

inherit module

EXTRA_OEMAKE:append:task-install = " -C ${STAGING_KERNEL_DIR} M=${S}"

# The inherit of module.bbclass will automatically name module packages with
# "kernel-module-" prefix as required by the oe-core build environment.

RPROVIDES:${PN} += "kernel-module-faulty"
RPROVIDES:${PN} += "kernel-module-hello"
