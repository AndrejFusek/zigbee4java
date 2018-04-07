package org.bubblecloud.zigbee.v3.zcl.protocol.command.ias.zone;

import org.bubblecloud.zigbee.v3.zcl.ZclCommand;
import org.bubblecloud.zigbee.v3.zcl.ZclCommandMessage;
import org.bubblecloud.zigbee.v3.zcl.protocol.ZclCommandType;
import org.bubblecloud.zigbee.v3.zcl.protocol.ZclFieldType;


/**
 * Code generated Initiate Test Mode Command value object class.
 */
public class InitiateTestModeCommand extends ZclCommand {
    /**
     * Test Mode Duration command message field.
     */
    private Integer testModeDuration;
    /**
     * Current Zone Sensitivity Level command message field.
     */
    private Integer currentZoneSensitivityLevel;

    /**
     * Default constructor setting the command type field.
     */
    public InitiateTestModeCommand() {
        this.setType(ZclCommandType.INITIATE_TEST_MODE_COMMAND);
    }

    /**
     * Constructor copying field values from command message.
     * @param message the command message
     */
    public InitiateTestModeCommand(final ZclCommandMessage message) {
        super(message);
        this.testModeDuration = (Integer) message.getFields().get(ZclFieldType.INITIATE_TEST_MODE_COMMAND_TEST_MODE_DURATION);
        this.currentZoneSensitivityLevel = (Integer) message.getFields().get(ZclFieldType.INITIATE_TEST_MODE_COMMAND_CURRENT_ZONE_SENSITIVITY_LEVEL);
    }

    @Override
    public ZclCommandMessage toCommandMessage() {
        final ZclCommandMessage message = super.toCommandMessage();
        message.getFields().put(ZclFieldType.INITIATE_TEST_MODE_COMMAND_TEST_MODE_DURATION,testModeDuration);
        message.getFields().put(ZclFieldType.INITIATE_TEST_MODE_COMMAND_CURRENT_ZONE_SENSITIVITY_LEVEL,currentZoneSensitivityLevel);
        return message;
    }

    /**
     * Gets Test Mode Duration.
     * @return the Test Mode Duration
     */
    public Integer getTestModeDuration() {
        return testModeDuration;
    }

    /**
     * Sets Test Mode Duration.
     * @param testModeDuration the Test Mode Duration
     */
    public void setTestModeDuration(final Integer testModeDuration) {
        this.testModeDuration = testModeDuration;
    }

    /**
     * Gets Current Zone Sensitivity Level.
     * @return the Current Zone Sensitivity Level
     */
    public Integer getCurrentZoneSensitivityLevel() {
        return currentZoneSensitivityLevel;
    }

    /**
     * Sets Current Zone Sensitivity Level.
     * @param currentZoneSensitivityLevel the Current Zone Sensitivity Level
     */
    public void setCurrentZoneSensitivityLevel(final Integer currentZoneSensitivityLevel) {
        this.currentZoneSensitivityLevel = currentZoneSensitivityLevel;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(super.toString());
        builder.append(", ");
        builder.append("testModeDuration");
        builder.append('=');
        builder.append(testModeDuration);
        builder.append(", ");
        builder.append("currentZoneSensitivityLevel");
        builder.append('=');
        builder.append(currentZoneSensitivityLevel);
        return builder.toString();
    }

}
